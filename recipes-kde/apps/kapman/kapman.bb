SUMMARY = "Kapman is a clone of the well known game Pac-Man"
DESCRIPTION = "Kapman is a clone of the well known game Pac-Man.\
\
You must run through the maze to eat all pills without being captured by a ghost. By eating an energizer, Kapman gets the ability to eat ghosts for a few seconds. When a stage is cleared of pills and energizer the player is taken to the next stage with slightly increased game speed."
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
SRC_URI[md5sum] = "fbd474165ca8bdbd78e409559ac36578"
SRC_URI[sha256sum] = "5be5feeceddc4dd5308910806884c03f4078240c72df36dc8329d4fbda676639"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
