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
SRC_URI[md5sum] = "0a5bf763ee5cd4827f8879fc0e46d4f9"
SRC_URI[sha256sum] = "39cf705ea4f1950f38edffd9bdb91ff5c745e8f1a36021e4560a26ecd5f0bf94"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${datadir}/icons \
"
