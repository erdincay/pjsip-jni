/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjmedia_codec_param_setting {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjmedia_codec_param_setting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjmedia_codec_param_setting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pjsuaJNI.delete_pjmedia_codec_param_setting(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setFrm_per_pkt(short value) {
    pjsuaJNI.pjmedia_codec_param_setting_frm_per_pkt_set(swigCPtr, this, value);
  }

  public short getFrm_per_pkt() {
    return pjsuaJNI.pjmedia_codec_param_setting_frm_per_pkt_get(swigCPtr, this);
  }

  public void setVad(long value) {
    pjsuaJNI.pjmedia_codec_param_setting_vad_set(swigCPtr, this, value);
  }

  public long getVad() {
    return pjsuaJNI.pjmedia_codec_param_setting_vad_get(swigCPtr, this);
  }

  public void setCng(long value) {
    pjsuaJNI.pjmedia_codec_param_setting_cng_set(swigCPtr, this, value);
  }

  public long getCng() {
    return pjsuaJNI.pjmedia_codec_param_setting_cng_get(swigCPtr, this);
  }

  public void setPenh(long value) {
    pjsuaJNI.pjmedia_codec_param_setting_penh_set(swigCPtr, this, value);
  }

  public long getPenh() {
    return pjsuaJNI.pjmedia_codec_param_setting_penh_get(swigCPtr, this);
  }

  public void setPlc(long value) {
    pjsuaJNI.pjmedia_codec_param_setting_plc_set(swigCPtr, this, value);
  }

  public long getPlc() {
    return pjsuaJNI.pjmedia_codec_param_setting_plc_get(swigCPtr, this);
  }

  public void setReserved(long value) {
    pjsuaJNI.pjmedia_codec_param_setting_reserved_set(swigCPtr, this, value);
  }

  public long getReserved() {
    return pjsuaJNI.pjmedia_codec_param_setting_reserved_get(swigCPtr, this);
  }

  public void setEnc_fmtp_mode(short value) {
    pjsuaJNI.pjmedia_codec_param_setting_enc_fmtp_mode_set(swigCPtr, this, value);
  }

  public short getEnc_fmtp_mode() {
    return pjsuaJNI.pjmedia_codec_param_setting_enc_fmtp_mode_get(swigCPtr, this);
  }

  public void setDec_fmtp_mode(short value) {
    pjsuaJNI.pjmedia_codec_param_setting_dec_fmtp_mode_set(swigCPtr, this, value);
  }

  public short getDec_fmtp_mode() {
    return pjsuaJNI.pjmedia_codec_param_setting_dec_fmtp_mode_get(swigCPtr, this);
  }

  public pjmedia_codec_param_setting() {
    this(pjsuaJNI.new_pjmedia_codec_param_setting(), true);
  }

}
