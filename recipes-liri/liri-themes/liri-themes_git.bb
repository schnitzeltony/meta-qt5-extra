SUMMARY = "Themes for a uniform look throughout Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "2f21663dfbd076f5a390e320f516b033c3090ad9"
S = "${WORKDIR}/git"

PACKAGES = " \
    ${PN}-grub \
    ${PN}-plymouth \
    ${PN}-sddm \
"

RDEPENDS_${PN}-plymouth += " \
    plymouth \
    plymouth-set-default-theme \
"
RDEPENDS_${PN}-sddm += " \
    liri-shell \
"

FILES_${PN}-grub += "/boot/grub/themes"
FILES_${PN}-plymouth += "${datadir}/plymouth/themes"
FILES_${PN}-sddm += "${datadir}/sddm/themes"

pkg_postinst_${PN}() {
#!/bin/sh
plymouth-set-default-theme -R lirios
}
