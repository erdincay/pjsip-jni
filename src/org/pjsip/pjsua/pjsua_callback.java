/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_callback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_callback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_callback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pjsuaJNI.delete_pjsua_callback(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setOn_call_state(SWIGTYPE_p_f_int_p_pjsip_event__void value) {
    pjsuaJNI.pjsua_callback_on_call_state_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsip_event__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsip_event__void getOn_call_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsip_event__void(cPtr, false);
  }

  public void setOn_incoming_call(SWIGTYPE_p_f_int_int_p_pjsip_rx_data__void value) {
    pjsuaJNI.pjsua_callback_on_incoming_call_set(swigCPtr, this, SWIGTYPE_p_f_int_int_p_pjsip_rx_data__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int_p_pjsip_rx_data__void getOn_incoming_call() {
    long cPtr = pjsuaJNI.pjsua_callback_on_incoming_call_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int_p_pjsip_rx_data__void(cPtr, false);
  }

  public void setOn_call_tsx_state(SWIGTYPE_p_f_int_p_pjsip_transaction_p_pjsip_event__void value) {
    pjsuaJNI.pjsua_callback_on_call_tsx_state_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsip_transaction_p_pjsip_event__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsip_transaction_p_pjsip_event__void getOn_call_tsx_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_tsx_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsip_transaction_p_pjsip_event__void(cPtr, false);
  }

  public void setOn_call_media_state(SWIGTYPE_p_f_int__void value) {
    pjsuaJNI.pjsua_callback_on_call_media_state_set(swigCPtr, this, SWIGTYPE_p_f_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int__void getOn_call_media_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_media_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int__void(cPtr, false);
  }

  public void setOn_stream_created(SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int_p_p_pjmedia_port__void value) {
    pjsuaJNI.pjsua_callback_on_stream_created_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int_p_p_pjmedia_port__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int_p_p_pjmedia_port__void getOn_stream_created() {
    long cPtr = pjsuaJNI.pjsua_callback_on_stream_created_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int_p_p_pjmedia_port__void(cPtr, false);
  }

  public void setOn_stream_destroyed(SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int__void value) {
    pjsuaJNI.pjsua_callback_on_stream_destroyed_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int__void getOn_stream_destroyed() {
    long cPtr = pjsuaJNI.pjsua_callback_on_stream_destroyed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjmedia_session_unsigned_int__void(cPtr, false);
  }

  public void setOn_dtmf_digit(SWIGTYPE_p_f_int_int__void value) {
    pjsuaJNI.pjsua_callback_on_dtmf_digit_set(swigCPtr, this, SWIGTYPE_p_f_int_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int__void getOn_dtmf_digit() {
    long cPtr = pjsuaJNI.pjsua_callback_on_dtmf_digit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int__void(cPtr, false);
  }

  public void setOn_call_transfer_request(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_enum_pjsip_status_code__void value) {
    pjsuaJNI.pjsua_callback_on_call_transfer_request_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_enum_pjsip_status_code__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_enum_pjsip_status_code__void getOn_call_transfer_request() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_transfer_request_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_enum_pjsip_status_code__void(cPtr, false);
  }

  public void setOn_call_transfer_status(SWIGTYPE_p_f_int_int_p_q_const__pj_str_t_int_p_int__void value) {
    pjsuaJNI.pjsua_callback_on_call_transfer_status_set(swigCPtr, this, SWIGTYPE_p_f_int_int_p_q_const__pj_str_t_int_p_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int_p_q_const__pj_str_t_int_p_int__void getOn_call_transfer_status() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_transfer_status_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int_p_q_const__pj_str_t_int_p_int__void(cPtr, false);
  }

  public void setOn_call_replace_request(SWIGTYPE_p_f_int_p_pjsip_rx_data_p_int_p_pj_str_t__void value) {
    pjsuaJNI.pjsua_callback_on_call_replace_request_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsip_rx_data_p_int_p_pj_str_t__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsip_rx_data_p_int_p_pj_str_t__void getOn_call_replace_request() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_replace_request_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsip_rx_data_p_int_p_pj_str_t__void(cPtr, false);
  }

  public void setOn_call_replaced(SWIGTYPE_p_f_int_int__void value) {
    pjsuaJNI.pjsua_callback_on_call_replaced_set(swigCPtr, this, SWIGTYPE_p_f_int_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int__void getOn_call_replaced() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_replaced_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int__void(cPtr, false);
  }

  public void setOn_reg_state(SWIGTYPE_p_f_int__void value) {
    pjsuaJNI.pjsua_callback_on_reg_state_set(swigCPtr, this, SWIGTYPE_p_f_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int__void getOn_reg_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_reg_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int__void(cPtr, false);
  }

  public void setOn_reg_state2(SWIGTYPE_p_f_int_p_pjsua_reg_info__void value) {
    pjsuaJNI.pjsua_callback_on_reg_state2_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsua_reg_info__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsua_reg_info__void getOn_reg_state2() {
    long cPtr = pjsuaJNI.pjsua_callback_on_reg_state2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsua_reg_info__void(cPtr, false);
  }

  public void setOn_incoming_subscribe(SWIGTYPE_p_f_int_p_pjsua_srv_pres_int_p_q_const__pj_str_t_p_pjsip_rx_data_p_enum_pjsip_status_code_p_pj_str_t_p_pjsua_msg_data__void value) {
    pjsuaJNI.pjsua_callback_on_incoming_subscribe_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsua_srv_pres_int_p_q_const__pj_str_t_p_pjsip_rx_data_p_enum_pjsip_status_code_p_pj_str_t_p_pjsua_msg_data__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsua_srv_pres_int_p_q_const__pj_str_t_p_pjsip_rx_data_p_enum_pjsip_status_code_p_pj_str_t_p_pjsua_msg_data__void getOn_incoming_subscribe() {
    long cPtr = pjsuaJNI.pjsua_callback_on_incoming_subscribe_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsua_srv_pres_int_p_q_const__pj_str_t_p_pjsip_rx_data_p_enum_pjsip_status_code_p_pj_str_t_p_pjsua_msg_data__void(cPtr, false);
  }

  public void setOn_srv_subscribe_state(SWIGTYPE_p_f_int_p_pjsua_srv_pres_p_q_const__pj_str_t_pjsip_evsub_state_p_pjsip_event__void value) {
    pjsuaJNI.pjsua_callback_on_srv_subscribe_state_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsua_srv_pres_p_q_const__pj_str_t_pjsip_evsub_state_p_pjsip_event__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsua_srv_pres_p_q_const__pj_str_t_pjsip_evsub_state_p_pjsip_event__void getOn_srv_subscribe_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_srv_subscribe_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsua_srv_pres_p_q_const__pj_str_t_pjsip_evsub_state_p_pjsip_event__void(cPtr, false);
  }

  public void setOn_buddy_state(SWIGTYPE_p_f_int__void value) {
    pjsuaJNI.pjsua_callback_on_buddy_state_set(swigCPtr, this, SWIGTYPE_p_f_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int__void getOn_buddy_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_buddy_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int__void(cPtr, false);
  }

  public void setOn_buddy_evsub_state(SWIGTYPE_p_f_int_p_pjsip_evsub_p_pjsip_event__void value) {
    pjsuaJNI.pjsua_callback_on_buddy_evsub_state_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsip_evsub_p_pjsip_event__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsip_evsub_p_pjsip_event__void getOn_buddy_evsub_state() {
    long cPtr = pjsuaJNI.pjsua_callback_on_buddy_evsub_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsip_evsub_p_pjsip_event__void(cPtr, false);
  }

  public void setOn_pager(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t__void value) {
    pjsuaJNI.pjsua_callback_on_pager_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t__void getOn_pager() {
    long cPtr = pjsuaJNI.pjsua_callback_on_pager_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t__void(cPtr, false);
  }

  public void setOn_pager2(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_pjsip_rx_data_int__void value) {
    pjsuaJNI.pjsua_callback_on_pager2_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_pjsip_rx_data_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_pjsip_rx_data_int__void getOn_pager2() {
    long cPtr = pjsuaJNI.pjsua_callback_on_pager2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_p_pjsip_rx_data_int__void(cPtr, false);
  }

  public void setOn_pager_status(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t__void value) {
    pjsuaJNI.pjsua_callback_on_pager_status_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t__void getOn_pager_status() {
    long cPtr = pjsuaJNI.pjsua_callback_on_pager_status_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t__void(cPtr, false);
  }

  public void setOn_pager_status2(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t_p_pjsip_tx_data_p_pjsip_rx_data_int__void value) {
    pjsuaJNI.pjsua_callback_on_pager_status2_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t_p_pjsip_tx_data_p_pjsip_rx_data_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t_p_pjsip_tx_data_p_pjsip_rx_data_int__void getOn_pager_status2() {
    long cPtr = pjsuaJNI.pjsua_callback_on_pager_status2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_void_enum_pjsip_status_code_p_q_const__pj_str_t_p_pjsip_tx_data_p_pjsip_rx_data_int__void(cPtr, false);
  }

  public void setOn_typing(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int__void value) {
    pjsuaJNI.pjsua_callback_on_typing_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int__void getOn_typing() {
    long cPtr = pjsuaJNI.pjsua_callback_on_typing_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int__void(cPtr, false);
  }

  public void setOn_typing2(SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int_p_pjsip_rx_data_int__void value) {
    pjsuaJNI.pjsua_callback_on_typing2_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int_p_pjsip_rx_data_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int_p_pjsip_rx_data_int__void getOn_typing2() {
    long cPtr = pjsuaJNI.pjsua_callback_on_typing2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pj_str_t_p_q_const__pj_str_t_p_q_const__pj_str_t_int_p_pjsip_rx_data_int__void(cPtr, false);
  }

  public void setOn_nat_detect(SWIGTYPE_p_f_p_q_const__pj_stun_nat_detect_result__void value) {
    pjsuaJNI.pjsua_callback_on_nat_detect_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__pj_stun_nat_detect_result__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__pj_stun_nat_detect_result__void getOn_nat_detect() {
    long cPtr = pjsuaJNI.pjsua_callback_on_nat_detect_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__pj_stun_nat_detect_result__void(cPtr, false);
  }

  public void setOn_call_redirected(SWIGTYPE_p_f_int_p_q_const__pjsip_uri_p_q_const__pjsip_event__pjsip_redirect_op value) {
    pjsuaJNI.pjsua_callback_on_call_redirected_set(swigCPtr, this, SWIGTYPE_p_f_int_p_q_const__pjsip_uri_p_q_const__pjsip_event__pjsip_redirect_op.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_q_const__pjsip_uri_p_q_const__pjsip_event__pjsip_redirect_op getOn_call_redirected() {
    long cPtr = pjsuaJNI.pjsua_callback_on_call_redirected_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_q_const__pjsip_uri_p_q_const__pjsip_event__pjsip_redirect_op(cPtr, false);
  }

  public void setOn_mwi_info(SWIGTYPE_p_f_int_p_pjsua_mwi_info__void value) {
    pjsuaJNI.pjsua_callback_on_mwi_info_set(swigCPtr, this, SWIGTYPE_p_f_int_p_pjsua_mwi_info__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_p_pjsua_mwi_info__void getOn_mwi_info() {
    long cPtr = pjsuaJNI.pjsua_callback_on_mwi_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_p_pjsua_mwi_info__void(cPtr, false);
  }

  public void setOn_transport_state(SWIGTYPE_p_pjsip_tp_state_callback value) {
    pjsuaJNI.pjsua_callback_on_transport_state_set(swigCPtr, this, SWIGTYPE_p_pjsip_tp_state_callback.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_tp_state_callback getOn_transport_state() {
    return new SWIGTYPE_p_pjsip_tp_state_callback(pjsuaJNI.pjsua_callback_on_transport_state_get(swigCPtr, this), true);
  }

  public void setOn_ice_transport_error(SWIGTYPE_p_f_int_pj_ice_strans_op_int_p_void__void value) {
    pjsuaJNI.pjsua_callback_on_ice_transport_error_set(swigCPtr, this, SWIGTYPE_p_f_int_pj_ice_strans_op_int_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_pj_ice_strans_op_int_p_void__void getOn_ice_transport_error() {
    long cPtr = pjsuaJNI.pjsua_callback_on_ice_transport_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_pj_ice_strans_op_int_p_void__void(cPtr, false);
  }

  public pjsua_callback() {
    this(pjsuaJNI.new_pjsua_callback(), true);
  }

}
