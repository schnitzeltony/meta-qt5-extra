SUMMARY = "2D and 3D Graph Calculator"
LICENSE = "GPL-2.0-only & LGPL-2.0-only & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gettext gtk-icon-cache mime-xdg

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
SRC_URI[sha256sum] = "4f67d55b449000988abb4440809bd99d1f0131a6f2e4dea9a910fca71290a0bc"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/kalgebramobile \
"
