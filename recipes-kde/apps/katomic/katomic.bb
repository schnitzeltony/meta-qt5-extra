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
SRC_URI[md5sum] = "675fe9af82d8b7e9c6192e4ab783237e"
SRC_URI[sha256sum] = "284d999ddd2685269c68eb3fb0d95468e4c51cbed61ae6df52f606a31712ce5c"
SRC_URI += "file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch"

FILES_${PN} += " \
    ${datadir} \
"
