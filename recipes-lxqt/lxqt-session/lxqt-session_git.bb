SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt kwindowsystem"

SRCREV = "15d40800eee8612073caf2a1895a9d8ace6c450d"
PV = "0.9.0+git${SRCPV}"
