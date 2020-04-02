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
 * JavaPOS Device Service class, intended to be used for testing purposes in LineDisplayTest.
 *
 */
public final class LineDisplayTestServiceAlwaysThrowingNPE implements jpos.services.LineDisplayService114, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_014_000;
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
    public int getBlinkRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setBlinkRate(int blinkRate) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapBitmap() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapBlink() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapBlinkRate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapBrightness() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCursorType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCustomGlyph() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDescriptors() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapHMarquee() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapICharWait() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapReadBack() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapReverse() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapScreenMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
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
    public boolean getCapVMarquee() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCharacterSet(int characterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
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
    public int getColumns() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCurrentWindow() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCurrentWindow(int currentWindow) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCursorColumn() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCursorColumn(int cursorColumn) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCursorRow() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCursorRow(int cursorRow) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCursorType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCursorType(int cursorType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCursorUpdate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCursorUpdate(boolean cursorUpdate) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCustomGlyphList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDeviceBrightness() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceBrightness(int deviceBrightness) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDeviceColumns() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDeviceDescriptors() throws JposException {
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
    public int getDeviceRows() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDeviceWindows() throws JposException {
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
    public int getGlyphHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getGlyphWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getInterCharacterWait() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setInterCharacterWait(int interCharacterWait) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMarqueeFormat() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMarqueeFormat(int marqueeFormat) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMarqueeRepeatWait() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMarqueeRepeatWait(int marqueeRepeatWait) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMarqueeType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMarqueeType(int marqueeType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMarqueeUnitWait() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMarqueeUnitWait(int marqueeUnitWait) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaximumX() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaximumY() throws JposException {
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
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRows() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getScreenMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setScreenMode(int screenMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getScreenModeList() throws JposException {
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
    public void clearDescriptors() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearText() throws JposException 
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
    public void createWindow(int viewportRow, int viewportColumn, int viewportHeight, int viewportWidth, int windowHeight, int windowWidth) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void defineGlyph(int glyphCode, byte[] glyph) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void destroyWindow() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void displayBitmap(String fileName, int width, int alignmentX, int alignmentY) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void displayText(String data, int attribute) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void displayTextAt(int row, int column, String data, int attribute) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void readCharacterAtCursor(int[] aChar) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void refreshWindow(int window) throws JposException 
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
    public void scrollText(int direction, int units) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setBitmap(int bitmapNumber, String fileName, int width, int alignmentX, int alignmentY) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setDescriptor(int descriptor, int attribute) throws JposException 
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
