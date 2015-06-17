SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "7963ead0cdd4180b61e5d8a90827c60f6b077965"
PV = "0.9.0"
SRC_URI += " \
    file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch \
    file://0002-Unify-naming-for-a-unique-lxqt.-No-more-suffixes.patch \
"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/platformthemes"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/platformthemes/.debug"

