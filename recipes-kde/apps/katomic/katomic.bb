SUMMARY = "Katomic is a fun and educational game built around molecular geometry"
DESCRIPTION = "KAtomic is a fun educational game built around molecular geometry. It employs simplistic two-dimensional looks at different chemical elements."
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kcoreaddons \
    kconfig \
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
SRC_URI[md5sum] = "3af891e3527a254a901fa1ca88412f63"
SRC_URI[sha256sum] = "1a85acea5ce335cb111bf34f1f4f281e08e737698795eaf3f05a148c9721fa69"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

FILES_${PN} += " \
    ${datadir} \
"
