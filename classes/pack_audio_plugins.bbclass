# Auto package audio plugins

PACKAGES =+ "${PN}-dssi ${PN}-ladspa ${PN}-lv2 ${PN}-vst"

FILES_${PN}-dssi += "${libdir}/dssi"
FILES_${PN}-ladspa += "${libdir}/ladspa"
FILES_${PN}-lv2 += "${libdir}/lv2"
FILES_${PN}-vst += "${libdir}/vst"
