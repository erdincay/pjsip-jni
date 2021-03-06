/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjmedia_aud_dev_cap {
  PJMEDIA_AUD_DEV_CAP_EXT_FORMAT(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_EXT_FORMAT_get()),
  PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_INPUT_LATENCY_get()),
  PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_LATENCY_get()),
  PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_INPUT_VOLUME_SETTING_get()),
  PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_VOLUME_SETTING_get()),
  PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_INPUT_SIGNAL_METER_get()),
  PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_SIGNAL_METER_get()),
  PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_INPUT_ROUTE_get()),
  PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_OUTPUT_ROUTE_get()),
  PJMEDIA_AUD_DEV_CAP_EC(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_EC_get()),
  PJMEDIA_AUD_DEV_CAP_EC_TAIL(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_EC_TAIL_get()),
  PJMEDIA_AUD_DEV_CAP_VAD(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_VAD_get()),
  PJMEDIA_AUD_DEV_CAP_CNG(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_CNG_get()),
  PJMEDIA_AUD_DEV_CAP_PLC(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_PLC_get()),
  PJMEDIA_AUD_DEV_CAP_MAX(pjsuaJNI.PJMEDIA_AUD_DEV_CAP_MAX_get());

  public final int swigValue() {
    return swigValue;
  }

  public static pjmedia_aud_dev_cap swigToEnum(int swigValue) {
    pjmedia_aud_dev_cap[] swigValues = pjmedia_aud_dev_cap.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjmedia_aud_dev_cap swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjmedia_aud_dev_cap.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjmedia_aud_dev_cap() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjmedia_aud_dev_cap(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjmedia_aud_dev_cap(pjmedia_aud_dev_cap swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

