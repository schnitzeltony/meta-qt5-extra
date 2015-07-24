SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "a287e724ea4a59557a88399e88e2dcb942b5640a"
PV = "0.9.0+git${SRCPV}"

FILES_${PN}-dev += "${datadir}/lxqt/lxqt-about/KF5WindowSystemTargets-noconfig.cmake"
