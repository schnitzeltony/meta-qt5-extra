SUMMARY = "Kapman is a clone of the well known game Pac-Man"
DESCRIPTION = "Kapman is a clone of the well known game Pac-Man.\
\
You must run through the maze to eat all pills without being captured by a ghost. By eating an energizer, Kapman gets the ability to eat ghosts for a few seconds. When a stage is cleared of pills and energizer the player is taken to the next stage with slightly increased game speed."
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
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
SRC_URI[md5sum] = "0af6c5a83a1ca72fe34b6fe54d64011b"
SRC_URI[sha256sum] = "653d87db55d75aa4163433cd881dd54a2c53770624ed3e27821303cfbf5405c4"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
