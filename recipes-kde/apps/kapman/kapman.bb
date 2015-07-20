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
SRC_URI[md5sum] = "99d47325af149e21c0820a1699341f1a"
SRC_URI[sha256sum] = "c8cdad68a99a3e152f8d44c522be18abd64e5c1e05964784503d216e89db742b"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
