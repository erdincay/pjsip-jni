/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsip_cred_info_ext_aka {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsip_cred_info_ext_aka(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsip_cred_info_ext_aka obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pjsuaJNI.delete_pjsip_cred_info_ext_aka(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setK(pj_str_t value) {
    pjsuaJNI.pjsip_cred_info_ext_aka_k_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getK() {
    long cPtr = pjsuaJNI.pjsip_cred_info_ext_aka_k_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setOp(pj_str_t value) {
    pjsuaJNI.pjsip_cred_info_ext_aka_op_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getOp() {
    long cPtr = pjsuaJNI.pjsip_cred_info_ext_aka_op_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setAmf(pj_str_t value) {
    pjsuaJNI.pjsip_cred_info_ext_aka_amf_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getAmf() {
    long cPtr = pjsuaJNI.pjsip_cred_info_ext_aka_amf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setCb(SWIGTYPE_p_pjsip_cred_cb value) {
    pjsuaJNI.pjsip_cred_info_ext_aka_cb_set(swigCPtr, this, SWIGTYPE_p_pjsip_cred_cb.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_cred_cb getCb() {
    return new SWIGTYPE_p_pjsip_cred_cb(pjsuaJNI.pjsip_cred_info_ext_aka_cb_get(swigCPtr, this), true);
  }

  public pjsip_cred_info_ext_aka() {
    this(pjsuaJNI.new_pjsip_cred_info_ext_aka(), true);
  }

}
