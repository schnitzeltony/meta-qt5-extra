PACKAGECONFIG ?= "nss ifupdown netconfig dhclient dnsmasq \
    ${@bb.utils.contains('DISTRO_FEATURES','systemd','systemd','consolekit',d)} \
    wifi \
    bluez5 \
    modemmanager \
"
