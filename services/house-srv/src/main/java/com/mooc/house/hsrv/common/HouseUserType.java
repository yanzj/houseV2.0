package com.mooc.house.hsrv.common;

/**
 * 枚举：用户与房产类型
 */
public enum HouseUserType {
  SALE(1),BOOKMARK(2);
  
  public  final Integer value;
  
  private HouseUserType(Integer value){
    this.value = value;
  }
  

}
