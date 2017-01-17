SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "libfm-qt"

SRCREV = "c048d7214920a74f1604f7832668a8c73be09ac3"
PV = "0.11.3"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
