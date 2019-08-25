SUMMARY = "2D and 3D Graph Calculator"
LICENSE = "GPLv2 & LGPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += "\
    ncurses \
    readline \
    analitza \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kconfigwidgets \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "9cebf309ed192c91149bd5195de611a3"
SRC_URI[sha256sum] = "b875b2bfe985e5c595f60fbb146fb4545c34321bb86f7fc04164a23f0bb3e9eb"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kalgebramobile \
"
