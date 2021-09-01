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
SRC_URI[sha256sum] = "0210777ada99795086d7ec348143e4f0e48089dd15fd30f09eb68d3739275054"

FILES:${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
