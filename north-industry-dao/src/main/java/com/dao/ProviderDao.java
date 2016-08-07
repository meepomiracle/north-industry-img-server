package com.dao;

import com.model.Provider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by hadoop on 2016/7/31.
 */
@Scope("prototype")
@Repository("providerDao")
public class ProviderDao<T> extends BaseDaoIml<T> {
    public boolean verifyToken(long id, String tkn) {
        Provider p = (Provider) this.get(Provider.class, id);
        if (p == null)
            return false;
        else {
            if (p.getProToken().equals(tkn)) {
                long current_seconds = System.currentTimeMillis();
                if (current_seconds < p.getProExpire()) {
                    //token还有效
                    return true;
                }
            }
        }
        return false;
    }
}
