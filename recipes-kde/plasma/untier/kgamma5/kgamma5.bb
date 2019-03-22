SUMMARY = "Adjust your monitor's gamma settings"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kdelibs4support \
    kdoctools \
    virtual/libx11 \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "cb4e1b8f8d4b4f3bf53a35b7bb02fe48"
SRC_URI[sha256sum] = "be0a76bf328dedeb9911d9d560e625a10850ea438374f39c22e17291abcd9689"

FILES_${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
