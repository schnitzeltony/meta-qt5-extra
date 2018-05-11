SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRC_URI += "file://0001-xxxwidget.h-include-QAction-explicitely.patch"
SRCREV = "d74f6f990905c43f01bbd609ae297f045b533045"
PV = "0.3.0"

RDEPENDS_${PN} += "pulseaudio-server"
