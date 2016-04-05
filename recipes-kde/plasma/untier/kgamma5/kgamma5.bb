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
SRC_URI[md5sum] = "75de451386dd962dd5b772caadde46e8"
SRC_URI[sha256sum] = "49ea28132892ff874217f40259f6d78260d1aeaf81b2496eb22cdc04e6c8de5d"

FILES_${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
