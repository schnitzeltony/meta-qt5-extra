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
SRC_URI[md5sum] = "13b8466091303121ec1b0d11ae6665ef"
SRC_URI[sha256sum] = "bb584d39b617a52fdb9999411c273979574bff15c19da33a2b3a212d19448c3e"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
