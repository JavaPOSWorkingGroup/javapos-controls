////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in VideoCaptureTest.
 *
 */
public final class VideoCaptureTestServiceAlwaysThrowingNPE implements jpos.services.VideoCaptureService116, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1017000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1016000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_IDLE;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    
    @Override
    public boolean getAutoExposure() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoExposure(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAutoFocus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoFocus(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAutoGain() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoGain(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAutoWhiteBalance() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoWhiteBalance(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getBrightness() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setBrightness(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCapAssociatedHardTotalsDevice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoExposure() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoFocus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoGain() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoWhiteBalance() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapBrightness() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapContrast() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapExposure() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapGain() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapHorizontalFlip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapHue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPhoto() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPhotoColorSpace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPhotoFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPhotoResolution() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPhotoType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSaturation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapStorage() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVerticalFlip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVideo() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVideoColorSpace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVideoFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVideoResolution() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVideoType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getContrast() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setContrast(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getExposure() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setExposure(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getGain() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setGain(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getHorizontalFlip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setHorizontalFlip(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getHue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setHue(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoColorSpace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPhotoColorSpace(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoColorSpaceList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPhotoFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPhotoFrameRate(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPhotoMaxFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoResolution() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPhotoResolution(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoResolutionList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPhotoType(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhotoTypeList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPowerNotify(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRemainingRecordingTimeInSec() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSaturation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSaturation(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getStorage() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setStorage(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getVerticalFlip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVerticalFlip(boolean newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoCaptureMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoCaptureMode(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoColorSpace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoColorSpace(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoColorSpaceList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoFrameRate(int newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoMaxFrameRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoResolution() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoResolution(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoResolutionList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoType(String newValue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoTypeList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void startVideo(String fileName, boolean overwrite, int recordingTime) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void stopVideo() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void takePhoto(String fileName, boolean overwrite, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
}
