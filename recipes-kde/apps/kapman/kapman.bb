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
SRC_URI[md5sum] = "53d2b5f15de57ea0a03177fe70d8c664"
SRC_URI[sha256sum] = "c1a32c78e3a75448cc9d681b66b2f4168cddd0b8647fb68bcab0d9ce223443a5"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
