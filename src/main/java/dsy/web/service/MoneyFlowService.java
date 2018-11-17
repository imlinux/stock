package dsy.web.service;

import dsy.web.dao.MoneyFlowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-16
 */
@Transactional
@Service
public class MoneyFlowService {

    @Autowired
    private MoneyFlowDao moneyFlowDao;

    public void syncIndustryMoneyFlowFromEastMoney() throws Exception {

        String json = get("", "UTF-8");


    }
}
