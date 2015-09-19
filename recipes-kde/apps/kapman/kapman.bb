SUMMARY = "Kapman is a clone of the well known game Pac-Man"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kcoreaddons \
    kconfig \
    kwindowsystem \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    kio \
    knotifyconfig \
    phonon \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "9aaa561bb4cc736b13f77d3062ffcc47"
SRC_URI[sha256sum] = "ff39c93cd02d7a3aee37e566fd8ac6fd7b1ad72be5ee1cc00b759daad5641f1c"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
