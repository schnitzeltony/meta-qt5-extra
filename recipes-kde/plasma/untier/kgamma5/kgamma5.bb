SUMMARY = "Adjust your monitor's gamma settings"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    kconfig-native kconfig \
    kdoctools-native \
    virtual/libx11 \
    kdelibs4support \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "3ddee0474910d888bf074ef93691b3f4f7daaae2dbc37d983d3983ffe3807fcf"

FILES:${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

INSANE_SKIP:${PN} = "dev-so"
