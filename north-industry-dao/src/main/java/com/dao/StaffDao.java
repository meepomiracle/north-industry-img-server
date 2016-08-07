package com.dao;

import com.model.Staff;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by hadoop on 2016/7/31.
 */
@Scope("prototype")
@Repository("staffDao")
public class StaffDao<T> extends BaseDaoIml<T> {
    public   boolean verifyToken(long id,String tkn){

        Staff staff = (Staff) this.get(Staff.class,id);
        if(staff==null)
            return  false;
        else {
            if(staff.getStaToken().equals(tkn)){
                long current_seconds= System.currentTimeMillis();
                if(current_seconds<staff.getStaExpire()){
                    //token还有效
                    return  true;
                }
            }
        }
        return  false;
    }
}
