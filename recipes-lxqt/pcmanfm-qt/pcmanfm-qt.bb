SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check mime-xdg

DEPENDS += "libfm-qt"

SRCREV = "031f41d29f00264c7d42ad20946aa3c86b67fbfe"
PV = "1.1.0"

FILES:${PN} += "${datadir}/${BPN}/lxqt/settings.conf"

RRECOMMENDS:${PN} = "gvfs gvfsd-trash eject"
