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
SRC_URI[md5sum] = "70795d40845ce31ccc6cbbedc159b1f5"
SRC_URI[sha256sum] = "12b2a0e703312159a8a217ddb5e19c9a9bea1825d668dd4377fe8e52101f3c90"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/kconf_update \
    ${datadir}/icons \
"
