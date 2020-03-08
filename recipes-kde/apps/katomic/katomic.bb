SUMMARY = "Katomic is a fun and educational game built around molecular geometry"
DESCRIPTION = "KAtomic is a fun educational game built around molecular geometry. It employs simplistic two-dimensional looks at different chemical elements."
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kwidgetsaddons \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kitemviews \
    kiconthemes \
    kxmlgui \
    kio \
    knotifyconfig \
    knewstuff \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "7d4c2ec150cc31837b4228554b2ebb3f"
SRC_URI[sha256sum] = "d7ed527e2546e94cb091e433a2e61618301152704c48e1f003e1f8e60b4f0cbd"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "perl"
