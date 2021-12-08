SUMMARY = "Adjust your monitor's gamma settings"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

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
SRC_URI[sha256sum] = "d3cf26446b29dbb995926c4a24f0ac21615e6f66a81663dc03cab3de454075ac"

FILES:${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
