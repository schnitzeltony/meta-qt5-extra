require ${BPN}.inc

inherit native

do_install() {
	# the header
    install -d ${D}/${includedir}
    install -m 0644 ${S}/lv2/lv2plug.in/ns/lv2core/lv2.h ${D}/${includedir}/
    install -d ${D}/${includedir}/lv2/lv2plug.in/ns/lv2core
    install -m 0644 ${S}/lv2/lv2plug.in/ns/lv2core/lv2.h ${D}/${includedir}/lv2/lv2plug.in/ns/lv2core/
}
