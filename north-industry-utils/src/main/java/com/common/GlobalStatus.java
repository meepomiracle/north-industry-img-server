package com.common;

public enum GlobalStatus {
    error,succeed,unknown,notLogin,noPay,timeExp,
    checkUncommited,checkUncheck,checkPassed1,checkPassed2,checkPassed3,checkFailed1,checkFailed2,checkFailed3,checkAllPassed,//标的审核状态
    roleStaff,roleProvider, //角色类型
    staffRoleTypeNormal,staffRoleTypeDepartmentCharger,staffRoleTypeChargeAll,staffRoleTypeExpert,staffRoleAdministrator,
    bidStateChecking,bidStateCheckFailed,bidStateBidding,bidStateBidded,bidStateStop,  //标的状态
  /*  proCheckUncommit,proCheckUncheck,proCheckPassed1,proCheckPassed2,proCheckPassed3,
    proCheckFail,proCheckAllPassed,//供应商资质审核状态*/
    proInfoUnComplete, GlobalStatus, proInfoCompled// 供应商信息完善程度发
}


