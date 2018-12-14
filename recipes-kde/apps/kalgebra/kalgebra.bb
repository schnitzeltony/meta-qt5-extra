SUMMARY = "2D and 3D Graph Calculator"
LICENSE = "GPLv2 & LGPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
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
SRC_URI[md5sum] = "0149b280afdf705bce796d26de87c113"
SRC_URI[sha256sum] = "d162c7b624edafe910c1c1d829b933e5ff7d5232713ac3b74dc382523f998341"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kalgebramobile \
"
