package com.msb.api.entity;


public class RoleEntity {

  private long rid;
  private String rname;
  private long rtype;
  private String rdesc;


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }


  public String getRname() {
    return rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }


  public long getRtype() {
    return rtype;
  }

  public void setRtype(long rtype) {
    this.rtype = rtype;
  }


  public String getRdesc() {
    return rdesc;
  }

  public void setRdesc(String rdesc) {
    this.rdesc = rdesc;
  }

}
