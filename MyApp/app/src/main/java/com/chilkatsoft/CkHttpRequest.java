/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkHttpRequest {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkHttpRequest(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkHttpRequest obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkHttpRequest(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkHttpRequest() {
    this(chilkatJNI.new_CkHttpRequest(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkHttpRequest_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkHttpRequest_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkHttpRequest_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Boundary(CkString str) {
    chilkatJNI.CkHttpRequest_get_Boundary(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String boundary() {
    return chilkatJNI.CkHttpRequest_boundary(swigCPtr, this);
  }

  public void put_Boundary(String newVal) {
    chilkatJNI.CkHttpRequest_put_Boundary(swigCPtr, this, newVal);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkHttpRequest_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkHttpRequest_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkHttpRequest_put_Charset(swigCPtr, this, newVal);
  }

  public void get_ContentType(CkString str) {
    chilkatJNI.CkHttpRequest_get_ContentType(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String contentType() {
    return chilkatJNI.CkHttpRequest_contentType(swigCPtr, this);
  }

  public void put_ContentType(String newVal) {
    chilkatJNI.CkHttpRequest_put_ContentType(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkHttpRequest_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkHttpRequest_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkHttpRequest_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_EntireHeader(CkString str) {
    chilkatJNI.CkHttpRequest_get_EntireHeader(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String entireHeader() {
    return chilkatJNI.CkHttpRequest_entireHeader(swigCPtr, this);
  }

  public void put_EntireHeader(String newVal) {
    chilkatJNI.CkHttpRequest_put_EntireHeader(swigCPtr, this, newVal);
  }

  public void get_HttpVerb(CkString str) {
    chilkatJNI.CkHttpRequest_get_HttpVerb(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpVerb() {
    return chilkatJNI.CkHttpRequest_httpVerb(swigCPtr, this);
  }

  public void put_HttpVerb(String newVal) {
    chilkatJNI.CkHttpRequest_put_HttpVerb(swigCPtr, this, newVal);
  }

  public void get_HttpVersion(CkString str) {
    chilkatJNI.CkHttpRequest_get_HttpVersion(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpVersion() {
    return chilkatJNI.CkHttpRequest_httpVersion(swigCPtr, this);
  }

  public void put_HttpVersion(String newVal) {
    chilkatJNI.CkHttpRequest_put_HttpVersion(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkHttpRequest_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkHttpRequest_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkHttpRequest_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkHttpRequest_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkHttpRequest_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkHttpRequest_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkHttpRequest_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkHttpRequest_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumHeaderFields() {
    return chilkatJNI.CkHttpRequest_get_NumHeaderFields(swigCPtr, this);
  }

  public int get_NumParams() {
    return chilkatJNI.CkHttpRequest_get_NumParams(swigCPtr, this);
  }

  public void get_Path(CkString str) {
    chilkatJNI.CkHttpRequest_get_Path(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String path() {
    return chilkatJNI.CkHttpRequest_path(swigCPtr, this);
  }

  public void put_Path(String newVal) {
    chilkatJNI.CkHttpRequest_put_Path(swigCPtr, this, newVal);
  }

  public boolean get_SendCharset() {
    return chilkatJNI.CkHttpRequest_get_SendCharset(swigCPtr, this);
  }

  public void put_SendCharset(boolean newVal) {
    chilkatJNI.CkHttpRequest_put_SendCharset(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkHttpRequest_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkHttpRequest_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkHttpRequest_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkHttpRequest_version(swigCPtr, this);
  }

  public boolean AddBytesForUpload(String name, String remoteFileName, CkByteData byteData) {
    return chilkatJNI.CkHttpRequest_AddBytesForUpload(swigCPtr, this, name, remoteFileName, CkByteData.getCPtr(byteData), byteData);
  }

  public boolean AddBytesForUpload2(String name, String remoteFileName, CkByteData byteData, String contentType) {
    return chilkatJNI.CkHttpRequest_AddBytesForUpload2(swigCPtr, this, name, remoteFileName, CkByteData.getCPtr(byteData), byteData, contentType);
  }

  public boolean AddFileForUpload(String name, String filePath) {
    return chilkatJNI.CkHttpRequest_AddFileForUpload(swigCPtr, this, name, filePath);
  }

  public boolean AddFileForUpload2(String name, String filePath, String contentType) {
    return chilkatJNI.CkHttpRequest_AddFileForUpload2(swigCPtr, this, name, filePath, contentType);
  }

  public void AddHeader(String name, String value) {
    chilkatJNI.CkHttpRequest_AddHeader(swigCPtr, this, name, value);
  }

  public void AddParam(String name, String value) {
    chilkatJNI.CkHttpRequest_AddParam(swigCPtr, this, name, value);
  }

  public boolean AddStringForUpload(String name, String filename, String strData, String charset) {
    return chilkatJNI.CkHttpRequest_AddStringForUpload(swigCPtr, this, name, filename, strData, charset);
  }

  public boolean AddStringForUpload2(String name, String filename, String strData, String charset, String contentType) {
    return chilkatJNI.CkHttpRequest_AddStringForUpload2(swigCPtr, this, name, filename, strData, charset, contentType);
  }

  public boolean AddSubHeader(int index, String name, String value) {
    return chilkatJNI.CkHttpRequest_AddSubHeader(swigCPtr, this, index, name, value);
  }

  public boolean GenerateRequestText(CkString outStr) {
    return chilkatJNI.CkHttpRequest_GenerateRequestText(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String generateRequestText() {
    return chilkatJNI.CkHttpRequest_generateRequestText(swigCPtr, this);
  }

  public boolean GetHeaderField(String name, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetHeaderField(swigCPtr, this, name, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderField(String name) {
    return chilkatJNI.CkHttpRequest_getHeaderField(swigCPtr, this, name);
  }

  public String headerField(String name) {
    return chilkatJNI.CkHttpRequest_headerField(swigCPtr, this, name);
  }

  public boolean GetHeaderName(int index, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetHeaderName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderName(int index) {
    return chilkatJNI.CkHttpRequest_getHeaderName(swigCPtr, this, index);
  }

  public String headerName(int index) {
    return chilkatJNI.CkHttpRequest_headerName(swigCPtr, this, index);
  }

  public boolean GetHeaderValue(int index, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetHeaderValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderValue(int index) {
    return chilkatJNI.CkHttpRequest_getHeaderValue(swigCPtr, this, index);
  }

  public String headerValue(int index) {
    return chilkatJNI.CkHttpRequest_headerValue(swigCPtr, this, index);
  }

  public boolean GetParam(String name, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetParam(swigCPtr, this, name, CkString.getCPtr(outStr), outStr);
  }

  public String getParam(String name) {
    return chilkatJNI.CkHttpRequest_getParam(swigCPtr, this, name);
  }

  public String param(String name) {
    return chilkatJNI.CkHttpRequest_param(swigCPtr, this, name);
  }

  public boolean GetParamName(int index, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetParamName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getParamName(int index) {
    return chilkatJNI.CkHttpRequest_getParamName(swigCPtr, this, index);
  }

  public String paramName(int index) {
    return chilkatJNI.CkHttpRequest_paramName(swigCPtr, this, index);
  }

  public boolean GetParamValue(int index, CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetParamValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getParamValue(int index) {
    return chilkatJNI.CkHttpRequest_getParamValue(swigCPtr, this, index);
  }

  public String paramValue(int index) {
    return chilkatJNI.CkHttpRequest_paramValue(swigCPtr, this, index);
  }

  public boolean GetUrlEncodedParams(CkString outStr) {
    return chilkatJNI.CkHttpRequest_GetUrlEncodedParams(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getUrlEncodedParams() {
    return chilkatJNI.CkHttpRequest_getUrlEncodedParams(swigCPtr, this);
  }

  public String urlEncodedParams() {
    return chilkatJNI.CkHttpRequest_urlEncodedParams(swigCPtr, this);
  }

  public boolean LoadBodyFromBytes(CkByteData byteData) {
    return chilkatJNI.CkHttpRequest_LoadBodyFromBytes(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public boolean LoadBodyFromFile(String filePath) {
    return chilkatJNI.CkHttpRequest_LoadBodyFromFile(swigCPtr, this, filePath);
  }

  public boolean LoadBodyFromString(String bodyStr, String charset) {
    return chilkatJNI.CkHttpRequest_LoadBodyFromString(swigCPtr, this, bodyStr, charset);
  }

  public void RemoveAllParams() {
    chilkatJNI.CkHttpRequest_RemoveAllParams(swigCPtr, this);
  }

  public boolean RemoveHeader(String name) {
    return chilkatJNI.CkHttpRequest_RemoveHeader(swigCPtr, this, name);
  }

  public void RemoveParam(String name) {
    chilkatJNI.CkHttpRequest_RemoveParam(swigCPtr, this, name);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkHttpRequest_SaveLastError(swigCPtr, this, path);
  }

  public void SetFromUrl(String url) {
    chilkatJNI.CkHttpRequest_SetFromUrl(swigCPtr, this, url);
  }

  public boolean StreamBodyFromFile(String filePath) {
    return chilkatJNI.CkHttpRequest_StreamBodyFromFile(swigCPtr, this, filePath);
  }

  public boolean StreamChunkFromFile(String path, String offset, String numBytes) {
    return chilkatJNI.CkHttpRequest_StreamChunkFromFile(swigCPtr, this, path, offset, numBytes);
  }

  public void UseGet() {
    chilkatJNI.CkHttpRequest_UseGet(swigCPtr, this);
  }

  public void UseHead() {
    chilkatJNI.CkHttpRequest_UseHead(swigCPtr, this);
  }

  public void UsePost() {
    chilkatJNI.CkHttpRequest_UsePost(swigCPtr, this);
  }

  public void UsePostMultipartForm() {
    chilkatJNI.CkHttpRequest_UsePostMultipartForm(swigCPtr, this);
  }

  public void UsePut() {
    chilkatJNI.CkHttpRequest_UsePut(swigCPtr, this);
  }

  public void UseUpload() {
    chilkatJNI.CkHttpRequest_UseUpload(swigCPtr, this);
  }

  public void UseUploadPut() {
    chilkatJNI.CkHttpRequest_UseUploadPut(swigCPtr, this);
  }

  public void UseXmlHttp(String xmlBody) {
    chilkatJNI.CkHttpRequest_UseXmlHttp(swigCPtr, this, xmlBody);
  }

}
