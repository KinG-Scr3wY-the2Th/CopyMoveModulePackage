/*
 * Sample module ingest job settings panel in the public domain.  
 * Feel free to use this as a template for your module ingest job settings
 * panels.
 * 
 *  Contact: Brian Carrier [carrier <at> sleuthkit [dot] org]
 *
 *  This is free and unencumbered software released into the public domain.
 *  
 *  Anyone is free to copy, modify, publish, use, compile, sell, or
 *  distribute this software, either in source code form or as a compiled
 *  binary, for any purpose, commercial or non-commercial, and by any
 *  means.
 *  
 *  In jurisdictions that recognize copyright laws, the author or authors
 *  of this software dedicate any and all copyright interest in the
 *  software to the public domain. We make this dedication for the benefit
 *  of the public at large and to the detriment of our heirs and
 *  successors. We intend this dedication to be an overt act of
 *  relinquishment in perpetuity of all present and future rights to this
 *  software under copyright law.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 *  IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 *  OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 *  ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE. 
 */
package de.fau.copymoveforgerydetection.modules.ingestModule;

import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettings;
import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettingsPanel;

/**
 * UI component used to make per ingest job settings for sample ingest modules.
 */
public class CopyMoveIngestModuleIngestJobSettingsPanel extends IngestModuleIngestJobSettingsPanel {

    /**
     * Creates new form SampleIngestModuleIngestJobSettings
     */
    public CopyMoveIngestModuleIngestJobSettingsPanel(CopyMoveModuleIngestJobSettings settings) {
        initComponents();
        customizeComponents(settings);
    }

    private void customizeComponents(CopyMoveModuleIngestJobSettings settings) {
        textFieldRegionMinSize.setText(Integer.toString(settings.getRegionMinSize()));
        labelRegionMinSize.setToolTipText(
                "Roughly the amount of pixel that constitute a copy move forgery. "
                        + "The number of 10x10 px blocks that are required for combination of different blocks "
                        + "with the same transformationfunction to be considered a copy move forgery. "
                        + "The default value has been determined through a optimization process on images with 10+ megapixel "
                        + "for the most part. When dealing with smaller images it might be beneficial to lower this value accordingly.");
    }

    /**
     * Gets the ingest job settings for an ingest module.
     *
     * @return The ingest settings.
     */
    @Override
    public IngestModuleIngestJobSettings getSettings() {
        int regionMinSize = Integer.parseInt(textFieldRegionMinSize.getText());

        return new CopyMoveModuleIngestJobSettings(regionMinSize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegionMinSize = new javax.swing.JLabel();
        textFieldRegionMinSize = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(labelRegionMinSize, org.openide.util.NbBundle.getMessage(CopyMoveIngestModuleIngestJobSettingsPanel.class, "CopyMoveIngestModuleIngestJobSettingsPanel.labelRegionMinSize.text")); // NOI18N

        textFieldRegionMinSize.setText(org.openide.util.NbBundle.getMessage(CopyMoveIngestModuleIngestJobSettingsPanel.class, "CopyMoveIngestModuleIngestJobSettingsPanel.textFieldRegionMinSize.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegionMinSize)
                .addGap(18, 18, 18)
                .addComponent(textFieldRegionMinSize, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegionMinSize)
                    .addComponent(textFieldRegionMinSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelRegionMinSize;
    private javax.swing.JTextField textFieldRegionMinSize;
    // End of variables declaration//GEN-END:variables
}
