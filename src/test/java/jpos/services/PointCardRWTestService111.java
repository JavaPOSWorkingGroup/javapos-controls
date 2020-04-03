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
import jpos.loader.JposServiceInstance;
import jpos.services.EventCallbacks;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in PointCardRWTest.
 *
 */
public final class PointCardRWTestService111 implements jpos.services.PointCardRWService111, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1011000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        // intentionally left empty
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public boolean getCapBold() throws JposException {
        return true;
    }
    
    @Override
    public int getCapCardEntranceSensor() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapCleanCard() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapClearPrint() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDwide() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDwideDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapItalic() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLeft90() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapPrint() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPrintMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRight90() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRotate180() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public int getCapTracksToRead() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapTracksToWrite() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public int getCardState() throws JposException {
        return 0;
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public void setCharacterSet(int charSet) throws JposException {
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
        return "";
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public int getDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getFontTypeFaceList() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getLineChars() throws JposException {
        return 0;
    }
    
    @Override
    public void setLineChars(int lineChars) throws JposException {
    }
    
    @Override
    public String getLineCharsList() throws JposException {
        return "";
    }
    
    @Override
    public int getLineHeight() throws JposException {
        return 0;
    }
    
    @Override
    public void setLineHeight(int lineHeight) throws JposException {
    }
    
    @Override
    public int getLineSpacing() throws JposException {
        return 0;
    }
    
    @Override
    public void setLineSpacing(int lineSpacing) throws JposException {
    }
    
    @Override
    public int getLineWidth() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
    }
    
    @Override
    public int getMapMode() throws JposException {
        return 0;
    }
    
    @Override
    public void setMapMode(int mapMode) throws JposException {
    }
    
    @Override
    public int getMaxLines() throws JposException {
        return 0;
    }
    
    @Override
    public int getOutputID() throws JposException {
        return 0;
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public int getPrintHeight() throws JposException {
        return 0;
    }
    
    @Override
    public int getReadState1() throws JposException {
        return 0;
    }
    
    @Override
    public int getReadState2() throws JposException {
        return 0;
    }
    
    @Override
    public int getRecvLength1() throws JposException {
        return 0;
    }
    
    @Override
    public int getRecvLength2() throws JposException {
        return 0;
    }
    
    @Override
    public int getSidewaysMaxChars() throws JposException {
        return 0;
    }
    
    @Override
    public int getSidewaysMaxLines() throws JposException {
        return 0;
    }
    
    @Override
    public String getTrack1Data() throws JposException {
        return "";
    }
    
    @Override
    public String getTrack2Data() throws JposException {
        return "";
    }
    
    @Override
    public String getTrack3Data() throws JposException {
        return "";
    }
    
    @Override
    public String getTrack4Data() throws JposException {
        return "";
    }
    
    @Override
    public String getTrack5Data() throws JposException {
        return "";
    }
    
    @Override
    public String getTrack6Data() throws JposException {
        return "";
    }
    
    @Override
    public int getTracksToRead() throws JposException {
        return 0;
    }
    
    @Override
    public void setTracksToRead(int tracksToRead) throws JposException {
    }
    
    @Override
    public int getTracksToWrite() throws JposException {
        return 0;
    }
    
    @Override
    public void setTracksToWrite(int tracksToWrite) throws JposException {
    }
    
    @Override
    public String getWrite1Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite1Data(String data) throws JposException {
    }
    
    @Override
    public String getWrite2Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite2Data(String data) throws JposException {
    }
    
    @Override
    public String getWrite3Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite3Data(String data) throws JposException {
    }
    
    @Override
    public String getWrite4Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite4Data(String data) throws JposException {
    }
    
    @Override
    public String getWrite5Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite5Data(String data) throws JposException {
    }
    
    @Override
    public String getWrite6Data() throws JposException {
        return "";
    }
    
    @Override
    public void setWrite6Data(String data) throws JposException {
    }
    
    @Override
    public int getWriteState1() throws JposException {
        return 0;
    }
    
    @Override
    public int getWriteState2() throws JposException {
        return 0;
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void cleanCard() throws JposException 
    {
    }
    
    @Override
    public void clearInput() throws JposException 
    {
    }
    
    @Override
    public void clearInputProperties() throws JposException 
    {
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void clearPrintWrite(int kind, int hPosition, int vPosition, int width, int height) throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
    }
    
    @Override
    public void printWrite(int kind, int hPosition, int vPosition, String data) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void rotatePrint(int rotation) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void validateData(String data) throws JposException 
    {
    }
}
