SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check mime-xdg

DEPENDS += "libfm-qt"

SRCREV = "8d4138c75f044c6d2a21cff83cd1006be5a18358"
PV = "0.17.0"

FILES_${PN} += " \
    ${datadir}/${BPN}/lxqt/settings.conf \
"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
