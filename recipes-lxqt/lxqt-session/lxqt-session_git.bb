SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt kwindowsystem"

SRCREV = "9877c3be90d00b94020ddd131a983864e1a77a62"
PV = "0.9.0"

FILES_${PN}-translations += "${datadir}/lxqt/translations/lxqt-config-session"

