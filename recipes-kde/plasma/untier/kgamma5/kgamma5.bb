SUMMARY = "Adjust your monitor's gamma settings"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

DEPENDS += " \
    kdelibs4support \
    kdoctools \
    virtual/libx11 \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "378c157a24cc008e47b878de6f5abb30"
SRC_URI[sha256sum] = "0e2947636a4a8e1e4bb9b5f38eb557b62e6482b2ccb51c72027f88dc4005ccc4"

FILES_${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
