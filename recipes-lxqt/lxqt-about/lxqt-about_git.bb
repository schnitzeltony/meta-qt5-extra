SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt

DEPENDS += " \
    liblxqt \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

SRCREV = "dd55813a86080341b6068d788b5efb19c869e8af"
PV = "0.9.0"

FILES_${PN}-dev += "${datadir}/lxqt/lxqt-about/KF5WindowSystemTargets-noconfig.cmake"
