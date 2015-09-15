SUMMARY = "Common files for LXQt"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://README.md;;beginline=8;endline=8;md5=fe89974151c809631428df2e880f46d4"

inherit lxqt gtk-icon-cache

DEPENDS += "liblxqt"

SRC_URI += " \
    file://0001-startlxqt-enable-starting-from-console.patch \
    file://0002-slightly-change-theme-defaults.patch \
"
SRCREV = "2059e47b22bf9fd49a8d0abaeb8e250e7f17ad84"
PV = "0.9.1+git${SRCPV}"

FILES_${PN} += " \
    ${datadir} \
"

RRECOMMENDS_${PN} += "oxygen qtsvg-plugins"
