SUMMARY = "A simple & lightweight desktop-agnostic Qt file archiver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt features_check mime-xdg


DEPENDS += " \
    qtx11extras \
    json-glib \
    libfm-qt \
"

SRCREV = "f6897c96029324181d026338683d5ab274422c6a"
PV = "0.1.1"
