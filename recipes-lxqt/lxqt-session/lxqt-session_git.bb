SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt kwindowsystem"

SRCREV = "a6acb54f459ad136c8b420b6709b55f1159e994b"
PV = "0.10.0"
