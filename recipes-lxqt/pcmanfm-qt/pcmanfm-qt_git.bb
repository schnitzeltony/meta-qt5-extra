SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check

DEPENDS += "libfm-qt"

SRCREV = "8ba67fdfc8d848e1882f992ee37eb8d795e857dd"
PV = "0.12.0"

RRECOMMENDS_${PN} = "gvfs gvfsd-trash eject"
