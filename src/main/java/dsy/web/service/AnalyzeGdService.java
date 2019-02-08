package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.GdRs;
import dsy.core.entity.SdGd;
import dsy.web.dao.GdRsDao;
import dsy.web.dao.SdGdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.StringTool.objectToString;

@Service
@Transactional
public class AnalyzeGdService {

    @Autowired
    private GdRsDao gdRsDao;

    @Autowired
    private SdGdDao sdGdDao;


    public void syncGdFromEasyMoney(String code) throws Exception {

        String url = "http://emweb.securities.eastmoney.com/ShareholderResearch/ShareholderResearchAjax?code=" + code;
        String json = get(url, "UTF-8");

        Map<String, Object> jsonObj = JSON.parseObject(json);

        List gdrs = (List) jsonObj.get("gdrs");

        gdrs.forEach( e -> {

            Map<String, Object> rec = (Map) e;

            GdRs gdRs = new GdRs();

            gdRs.setDate(objectToString(rec.get("rq")));
            gdRs.setGdrs(objectToString(rec.get("gdrs")));
            gdRs.setGdrsJsqbh(objectToString(rec.get("gdrs_jsqbh")));
            gdRs.setRjltg(objectToString(rec.get("rjltg")));
            gdRs.setRjltgJsqbh(objectToString(rec.get("rjltg_jsqbh")));
            gdRs.setCmjzd(objectToString(rec.get("cmjzd")));
            gdRs.setGj(objectToString(rec.get("gj")));
            gdRs.setRjcgje(objectToString(rec.get("rjcgje")));
            gdRs.setQsdgdcghj(objectToString(rec.get("qsdgdcghj")));
            gdRs.setQsdltgdcghj(objectToString(rec.get("qsdltgdcghj")));

            gdRs.setCode(code);
            gdRs.setId(gdRs.getDate() + gdRs.getCode());

            gdRsDao.save(gdRs);
        });

        List sdgd = new ArrayList();
        sdgd.addAll((List) jsonObj.get("sdgd"));
        sdgd.addAll((List) jsonObj.get("sdltgd"));

        sdgd.forEach( e -> {

            Map<String, Object> ee = (Map) e;
            String type = "sdgd";
            List l = (List) ee.get("sdgd");
            if(l == null) {
                l = (List) ee.get("sdltgd");
                type = "sdltgd";
            }
            final  String finalType = type;
            l.forEach(eee -> {
                Map<String, Object> rec = (Map) eee;

                SdGd sdGd = new SdGd();

                sdGd.setCode(code);
                sdGd.setDate(objectToString(rec.get("rq")));
                sdGd.setGdmc(objectToString(rec.get("gdmc")));
                sdGd.setType(finalType);
                sdGd.setGdxz(objectToString(rec.get("gdxz")));
                sdGd.setGflx(objectToString(rec.get("gflx")));
                sdGd.setCgs(objectToString(rec.get("cgs")));
                sdGd.setZltgbcgbl(objectToString(rec.get("zltgbcgbl")));
                sdGd.setZj(objectToString(rec.get("zj")));
                sdGd.setBdbl(objectToString(rec.get("bdbl")));

                sdGd.setId(sdGd.getDate() + sdGd.getCode() + sdGd.getGdmc() + sdGd.getType());
                sdGdDao.save(sdGd);
            });
        });
    }
}
