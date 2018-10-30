package dsy.web.service.impl;

import dsy.web.dao.MoneySupplyDao;
import dsy.core.entity.MoneySupply;
import dsy.web.service.MoneySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Service
@Transactional
public class MoneySupplyServiceImpl implements MoneySupplyService {

    @Autowired
    private MoneySupplyDao moneySupplyDao;

    @Override
    public List<MoneySupply> getAll() {
        return moneySupplyDao.getAll();
    }
}
