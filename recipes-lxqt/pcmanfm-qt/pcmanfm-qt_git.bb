SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "qtx11extras libxcb libfm-qt"

SRCREV = "a7533049f24bc02933ce00f61d123a069b51553a"
PV = "0.10.1"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
