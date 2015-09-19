SUMMARY = "Katomic is a fun and educational game built around molecular geometry"
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
SRC_URI[md5sum] = "569270d0d624bfca4cbc729904a06e0c"
SRC_URI[sha256sum] = "3e51d4228542645b808d19eddd40b7c314ce7a9a116eb9b03ba5a38de0d34666"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

FILES_${PN} += " \
    ${datadir} \
"
